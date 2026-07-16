class Solution {
    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();

        for(char novo : s.toCharArray()) {
            Character topo = queue.peekLast();
            if(novo == '(' || novo == '{' || novo == '[') 
                queue.addLast(novo);
            else if (topo == null) 
                return false;
            else if((topo == '(' && novo==')') ||
                    (topo == '[' && novo==']') ||
                    (topo == '{' && novo=='}') )
                queue.removeLast();    
             else {
                return false;
            }
        }

        return queue.isEmpty();
    }
}
