class Program4 {    
  public int index = 1;
}

class App extends Program4 {
    public App(int index) {
        index = index;
    }

    public static void main(String args[]) {
        App myApp = new App(10);
        System.out.println(myApp.index);
    }
}
