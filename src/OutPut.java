class Outer {
    private class Inner { // ✅ Private inner class
        void display() {
            System.out.println("Inside private Inner class");
        }
    }

    public void accessInner() {
        Inner obj = new Inner(); // ✅ Allowed inside Outer class
        obj.display();
    }
}

class OutPut {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInner(); // ✅ Output: Inside private Inner class
        // ❌ Outer.Inner obj = new Outer.Inner(); // Error: Inner is private
    }
}
