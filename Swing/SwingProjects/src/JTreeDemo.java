
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.*;
class JTreeDemoClass extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel label;
    JTreeDemoClass(){
        super("Tree Demo");
        //valid path must be given
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\MyJava");
        File f=new File("C:\\Users\\dell\\Desktop\\LearnJava");

        for(File x: f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree=new JTree(root);
        label=new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp=new JScrollPane(tree);

        add(sp,BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);

    }

    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}
public class JTreeDemo {
    public static void main(String[] args) {
        JTreeDemoClass jt = new JTreeDemoClass();
        jt.setSize(500,500);
        jt.setVisible(true);
        jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
