class classesObjects {
    static int myMethod(int a, int b)   /// static function is used to declare function
    {
        int c = a + b;
        return c;
    }
    static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    String sub = "java";
    public static void main(String[] args){
        // System.out.println(myMethod(5,3));
        // System.out.println(sum(5));
        // classesObjects v=new classesObjects();
        // System.out.println(v.sub);
        
        myStaticMethod();
        // myPublicMethod();
        classesObjects vb = new classesObjects();
        vb.myPublicMethod();

        // System.out.println(vb.g);

        // stringMethods objext = new stringMethods();
        // System.out.println(objext.g);

    }
    // recursive main function
    public static int sum(int m){
        if(m==1){
            return 1;
        }
        else{
            return m+sum(m-1);
        }
    }

}