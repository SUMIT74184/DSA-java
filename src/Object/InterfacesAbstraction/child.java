package Object.InterfacesAbstraction;

public  class child extends Parents{

    @Override
    void career(String name) {
        System.out.println("so my desired career will be"+name);
    }
    @Override
    void Partner(String name,int age){
        System.out.println("i love "+name+"and the aga will be"+age);

    }
}
