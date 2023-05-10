import java.util.Vector;

class vector_demo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(new Integer(5));
        v.addElement(new Integer(15));
        v.addElement(new Integer(25));
        v.addElement(new Integer(35));
        v.addElement(new Integer(45));
        System.out.println("Vector elements are: ");
        for (int i=0; i<v.size(); i++){
            System.out.print(" "+v.elementAt(i));
        }
        v.insertElementAt(11, 1);
        v.removeElementAt(0);
        v.removeElementAt(3);
        System.out.println("\nAfter adding and removing");
        for (int i=0; i<v.size(); i++){
            System.out.print(" "+v.elementAt(i));
        }
    }    
}
