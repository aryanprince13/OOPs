class Q9{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("Thread name : "+t.getName());
        System.out.println("Thread priority : "+t.getPriority());
        t.setName("My Thread");
        t.setPriority(1);
        System.out.println("Thread name : "+t.getName());
        System.out.println("Thread priority : "+t.getPriority());
    }
}