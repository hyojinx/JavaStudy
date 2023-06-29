package study15_1;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;

class PersonInfo{
    private String name;
    private String address;
    PersonInfo(){}
    public PersonInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class PersonInfoList{
    private String telNum;
    private HashMap<String,PersonInfo> pList;

    PersonInfoList(){
        pList = new HashMap<>();
    }
    void addPersonInfo(String name, String telNum,String address){
        PersonInfo pInfo = new PersonInfo(name,address);
        pList.put(telNum,pInfo);
    }
//   String getPersonInfoWithName(String name) {
//        for(Map.Entry<String,PersonInfo> entry:pList.entrySet()){
//            String tel = entry.getKey();
//            PersonInfo p = entry.getValue();
//            if(p.getName().equals(name)){
//                return "||이름:"+p.getName()+"||주소:"+p.getAddress()+"||번호"+tel;
//            }
//        }
//        return "해당 사항 없음";
//
//   }
//    public ArrayList<String> getPersonInfoWithName(String name){
//        ArrayList<String> results = new ArrayList<>();
//        Set<String> keySet = pList.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            if(s.contains(telNum)){
//                PersonInfo p = pList.get(s);
//                results.add("||이름:"+p.getName()+"||전화번호:"+s+"||주소:"+p.getAddress());
//            }
//        }
//        if(results.size()==0) {
//            results.add("해당 검색 대상이 없습니다.");
//        }
//        return results;
//    }
    String getPersonInfoWithName(String name) {
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (Map.Entry<String, PersonInfo> entry : pList.entrySet()) {
            String tel = entry.getKey();
            PersonInfo p = entry.getValue();
            if (p.getName().contains(name)) {
                sb.append("||이름:").append(p.getName()).append("||주소:").append(p.getAddress()).append("||번호").append(tel).append("\n");
                found = true;
            }
        }
        return found ? sb.toString() : "해당 사항 없음";
    }
//    String getPersonInfoWithTel(String Tel) {
//        for (Map.Entry<String, PersonInfo> entry : pList.entrySet()) {
//            String key = entry.getKey();
//            if (key.replace("-", "").startsWith(Tel)) {
//                PersonInfo pInfo = entry.getValue();
//                return "||이름:" + pInfo.getName() + " ||전화번호:" + key + " ||주소:" + pInfo.getAddress();
//            }
//        }
//        return "해당 검색 대상이 존재하지 않습니다.";
//    }

    public ArrayList<String> getPersonInfoWithTel(String telNum){
        ArrayList<String> results = new ArrayList<>();
        Set<String> keySet = pList.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if(s.contains(telNum)){
                PersonInfo p = pList.get(s);
                results.add("||이름:"+p.getName()+"||전화번호:"+s+"||주소:"+p.getAddress());
            }
        }
        if(results.size()==0) {
            results.add("해당 검색 대상이 없습니다.");
        }
        return results;
    }

    public HashMap<String, PersonInfo> getpList() {
        return pList;
    }

    public void setpList(HashMap<String, PersonInfo> pList) {
        this.pList = pList;
    }

}
public class HashMapPrac {
    public static void main(String[] args) {
        String search;
        String result;
        PersonInfoList personInfoList = new PersonInfoList();
        personInfoList.addPersonInfo("인순이","010-1111-1111","서울");
        personInfoList.addPersonInfo("권보아","010-2222-2222","대전");
        personInfoList.addPersonInfo("이보람","010-3333-3333","대구");
        Scanner sc = new Scanner(System.in);
        System.out.println("<<전화번호 목록>>");
        while(true){
            List<String> result2 = new ArrayList<>();
            System.out.println("조회대상 선택\n1.이름\n2.전화번호\n3.종료");
            System.out.print("선택:");
            int menu = sc.nextInt();
            if(menu==1){
                System.out.print("<검색>\n이름:");
                search = sc.next();
                result = personInfoList.getPersonInfoWithName(search);
                System.out.println(result);
                break;
            }else if(menu==2){
                System.out.print("<검색>\n전화번호:");
                search = sc.next();
                result2 = personInfoList.getPersonInfoWithTel(search);
            }else{
                System.out.println("검색 종료");
                break;
            }
            for(String res:result2){
                System.out.println(res);
            }
        }
    }

}
