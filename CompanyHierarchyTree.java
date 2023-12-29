import java.util.HashMap;
import java.util.Map;

public class CompanyHierarchyTree {

    public static void main(String[] args) {
        //최상위 데이터
        TreeNode rootTreeNode = new TreeNode("DATA");

        //Depth : 1의 데이터
        TreeNode hospital = new TreeNode("병원");
        TreeNode food = new TreeNode("음식");


        //Depth : 2의 데이터
        TreeNode patient = new TreeNode("환자");
        TreeNode doctor = new TreeNode("의사");

        //Depth : 3의 데이터
//=============================================================
        Map<String, String> map = new HashMap<>();
        map.put("이름", "홍석민");
        map.put("나이", "23");
        map.put("몸무게", "65KG");
        TreeNode patient_1 = new TreeNode(map);
//=============================================================
        Map<String, String> map2 = new HashMap<>();
        map2.put("이름", "유연준");
        map2.put("나이", "16");
        map2.put("몸무게", "80KG");
        TreeNode patient_2 = new TreeNode(map2);
//=============================================================


        //Depth : 1의 데이터 삽입
        rootTreeNode.addChild(hospital);
        rootTreeNode.addChild(food);


        //Depth : 2의 데이터 삽입
        hospital.addChild(patient);
        hospital.addChild(doctor);

        //Depth : 3의 데이터 삽입
        patient.addChild(patient_1);
        patient.addChild(patient_2);

        System.out.println("size : " + hospital.getChildNodes().size());
        System.out.println("size : " + patient.getChildNodes().size());

        patient.printValueList();

    }

}