package StacksProbs;

import java.util.Stack;

public class asteroidCollision {

    public static int[] asteroidCollisions(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (st.isEmpty() || asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0) {
                    int top = st.peek();
                    int modVal = Math.abs(asteroids[i]);

                    if (modVal == top) {
                        st.pop(); // Both asteroids destroy each other
                        asteroids[i] = 0; // Mark as destroyed
                        break;
                    } else if (modVal < top) {
                        asteroids[i] = 0; // Incoming asteroid gets destroyed
                        break;
                    } else {
                        st.pop(); // Remove smaller asteroid and continue
                    }
                }

                if (asteroids[i] != 0) {
                    st.push(asteroids[i]);
                }
            }
        }

        int len = st.size();
        int ansArray[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            ansArray[i] = st.pop();
        }
        return ansArray;
    }


    public static void main(String[] args) {
    int []astroids={-2,-2,1,-1};
    int []as=asteroidCollisions(astroids);
    for(int ae:as){
        System.out.println(ae);
    }
    }
}

