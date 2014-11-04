import java.util.Hashtable;

public class duplicate {
duplicateNode head;

public static void main(String args[]){
    duplicate list = new duplicate();
    list.addNode(1);
    list.addNode(1);
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.addNode(2);

    list.print();
    list.deleteDupsNoStorage(list.head);
    System.out.println();
    list.print();
}

public void print(){
    duplicateNode n = head;
    while(n!=null){
        System.out.print(n.data +" ");
        n = n.next;
    }
}

public void deleteDups(duplicateNode n){
    Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
    duplicateNode prev = null;

    while(n !=null){
        if(table.containsKey(new Integer(n.data))){
            prev.next = n.next;     //skip the previously stored references next node
        }else{
            table.put(new Integer(n.data) , true);
            prev = n;       //stores a reference to n
        }

        n = n.next;
    }
}

public void deleteDupsNoStorage(duplicateNode n){
    duplicateNode current = n;

    while(current!=null){
        duplicateNode runner = current;
        while(runner.next!=null){
            if(runner.next.data == current.data){
                runner.next = runner.next.next;
            }else{
                runner = runner.next;
            }
        }
        current = current.next;
    }

}

public void addNode(int d){
    duplicateNode n = new duplicateNode(d);
    if(this.head==null){
        this.head = n;
    }else{
        n.next = head;
        head = n;
    }
}

private class duplicateNode{
    duplicateNode next;
    int data;

    public duplicateNode(int d){
        this.data = d;
    }
}
}
