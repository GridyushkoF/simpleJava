package simpleJava.simpleFor;
public interface LoopBody {
    public void execute (int i) throws InterruptedException;
    //SimpleFor uses it like body of loop (for (...;...;...) {body} = SimpleFor.forI(...,...,i -> {body}))
    //Example: SimpleFor.forI(0, 5, i -> {
    //    System.out.println("Index: " + i);
    //});
}
