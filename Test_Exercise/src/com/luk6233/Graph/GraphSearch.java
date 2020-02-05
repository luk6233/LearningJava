package Graph;

import java.util.*;

public class GraphSearch {
    public static void main(String[] args) {
        HashMap<String, Friend[]> graphFriend = new HashMap<>();
        graphFriend.put("You", new Friend[]{new Friend("Alice"), new Friend("Bob"), new Friend("Claire")});
        graphFriend.put("Alice", new Friend[]{new Friend("Peggy", true)});
        graphFriend.put("Bob", new Friend[]{new Friend("Anuj"), graphFriend.get("Alice")[0]});
        graphFriend.put("Claire", new Friend[]{new Friend("Tom"), new Friend("Johny")});
        graphFriend.put("Peggy", new Friend[]{});
        graphFriend.put("Anuj", new Friend[]{});
        graphFriend.put("Tom", new Friend[]{});
        graphFriend.put("Johny", new Friend[]{});

        Queue<Friend> queue = new LinkedList<>(Arrays.asList(graphFriend.get("You")));
        int check = 0;
        ArrayList<String> checked = new ArrayList<>();


        Friend temp = queue.poll();
        while (temp != null) {
            if (temp.isSeller()) {
                if (!checked.contains(temp.getName())) {
                    System.out.println(temp.getName() + " is a mango seller!");
                    check = 1;
                    break;
                }
            } else {
                queue.addAll(Arrays.asList(graphFriend.get(temp.getName())));
                checked.add(temp.getName());
                temp = queue.poll();
            }
        }

        if (check == 0) System.out.println("There are not seller");


    }

    public static class Friend {
        private String name;
        private boolean seller;

        public Friend(String name, boolean seller) {
            this.name = name;
            this.seller = seller;
        }

        public Friend(String name) {
            this.name = name;
            this.seller = false;
        }

        public String getName() {
            return name;
        }

        public boolean isSeller() {
            return seller;
        }
    }
}
