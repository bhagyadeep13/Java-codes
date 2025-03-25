package Graph;
import java.util.*;;
public class a 
{
    public static void main(String[] args) 
    {
        String[] r={"bread"};
        List<List<String>> in=new ArrayList<>();
        List<String> al1=new ArrayList<>();
        al1.add("yeast");
        al1.add("flour");
        in.add(al1);
        String[] s={"yeast","flour","corn"};
        List<List<String>> adj=new ArrayList<>();
        int[] inDegree = new int[r.length];
        for(int i=0;i<in.size();i++)
        {
            List<String> al=in.get(i);
            for(int j=0;j<al.size();j++)
            {
                adj.get(j).add(al.get(i));
            }
            inDegree[i]=adj.get(i).size();
        }
        for(int i=0;i<inDegree.length;i++)
        {
            System.out.print(inDegree[i]+" ");
        }

    }
}
