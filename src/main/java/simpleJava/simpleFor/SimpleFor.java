package simpleJava.simpleFor;
public class SimpleFor {
    /*
     This for loop is designed to shorten the code,
     and now instead of for (int i = 0;i < 100;i++) {body}
     you can just do the following:
     1. Refer to the SimpleFor class (SimpleFor.)
     2. Call the forI method (SimpleFor.forI())
     3. Write the first index and the index to which iterates (SimpleFor.forI(1,100,))
     4. Implement Interface LoopBody (for example, use a lambda expression) (SimpleFor.forI(1,100,i -> System.out.println(i+1)))
     5. Done, now you can use it in your code and make it simpler and more concise!
     6.important: if src > dst then for cycle will look so: for (int i = 100;i > 0;i--) and second param is not inclusive!!!
        And simpleJava.simpleFor cycle handles with exceptions, and you should not write try catch
            Like example: SimpleFor.forI(10,0, i -> {
            System.out.println(i);
            Thread.sleep(1000);
        });
     */
        public static void forI (int src, int dst, LoopBody loopBody) {
            try {
                if (src < dst) {
                    for (int i = src; i < dst; i++) {
                        loopBody.execute(i);
                    }
                } else if (src > dst) {
                    for (int i = src; i > dst; i--) {
                        loopBody.execute(i);
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    public static void forI (int src, int dst,  int step, LoopBody loopBody) {
        try {
            if (src < dst) {
                for (int i = src; i < dst; i += step) {
                    loopBody.execute(i);
                }
            } else if (src > dst) {
                for (int i = src; i > dst; i -= step) {
                    loopBody.execute(i);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}