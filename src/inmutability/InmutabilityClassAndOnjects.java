package inmutability;

public class InmutabilityClassAndOnjects {
    /*An object  whose contents can not be changed
     *
     */
    private final int x;

    public InmutabilityClassAndOnjects(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

 class InmutabilityClassAndObjectTwo{
    private final int y;

    private final InmmutableClassAndObjectThree inmmutableClassAndObjectThree;

     public InmutabilityClassAndObjectTwo(int y, InmmutableClassAndObjectThree inmmutableClassAndObjectThree) {
         this.y = y;
         this.inmmutableClassAndObjectThree = inmmutableClassAndObjectThree;
     }

     public int getY() {
         return y;
     }

     public InmmutableClassAndObjectThree getInmmutableClassAndObjectThree() {
         return inmmutableClassAndObjectThree;
     }

 }

 class InmmutableClassAndObjectThree{
    private int z;
    private InmutabilityClassAndObjectTwo y;

     public InmmutableClassAndObjectThree(int z) {
         this.z = z;
     }

     public InmmutableClassAndObjectThree(int z, InmutabilityClassAndObjectTwo y) {
         this.z = z;
         this.y = y;
     }

     public int getZ() {
         return z;
     }

     public InmutabilityClassAndObjectTwo getY() {
         return y;
     }

     public void setZ(int z) {
         this.z = z;
     }

     public void setY(InmutabilityClassAndObjectTwo y) {
         this.y = y;
     }
 }
 class Inmmutability{
     public static void main(String[] args) {
         InmutabilityClassAndObjectTwo inmutabilityClassAndObjectTwo=new InmutabilityClassAndObjectTwo(1,new InmmutableClassAndObjectThree(1));

         InmmutableClassAndObjectThree inmmutableClassAndObjectThree=inmutabilityClassAndObjectTwo.getInmmutableClassAndObjectThree();

         inmmutableClassAndObjectThree.setZ(3);
     }
 }
