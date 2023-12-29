import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TreeNode {

    private String value;
    private Map<String, String> valueList;
    private List<TreeNode> childNodes;

    public TreeNode(String value) {
        this.value = value;
        this.childNodes = new LinkedList<>();
    }

    public TreeNode(Map<String, String> valueList) {
        this.valueList = valueList;
        this.childNodes = new LinkedList<>();
    }

    public void addChild(TreeNode childNode) {
        this.childNodes.add(childNode);
    }

    public void showTreeNodes() {
        BreathFirstSearchPrintTreeNodes.printNodes(this);
    }

    public String getValue() {
        return value;
    }

    public Map<String, String> getValueList() {
        return valueList;
    }

    public void printValueList() {
        if(this.getChildNodes() == null) {
            System.out.println("null 값입니다.");
        } else {
            for(TreeNode list : this.getChildNodes()){
                for(String key : list.getValueList().keySet()) {
                    System.out.print(list.getValueList().get(key) + " / ");
                }
            System.out.println("");
            }
        }
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }

    public List<TreeNode> findNodes() {


        return childNodes;
    }
}