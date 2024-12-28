package Object.inheritance.Principles;

  public class index {
    int length;
    int width;
    int height;

    //default constructor with the values passed into it

    index() {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    //cube
    index(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    //parameterised constructor
    index(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

//    copy constructor
    index(index old){
        this.height= old.height;;
        this.width= old.width;;
        this.length= old.length;
    }


    public void Information(){
        System.out.println("Running ");
    }



}

