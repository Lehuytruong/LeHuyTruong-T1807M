package Lap03;

public class MainSubthread { public static void main(String args[]){
    Subthread subthread = new Subthread();
    Thread thread = new Thread(subthread);
    thread.start();
}
}
