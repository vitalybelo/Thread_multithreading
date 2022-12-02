public class Friend implements Comparable<Friend>{

    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void throwBall (Friend catcher) {
        System.out.format("%s ---> %s кинул мне мяч!%n",catcher.getName(),this.name);

        synchronized (compareTo(catcher) > 0 ? catcher : this) {
            catcher.throwBall(this);
        }
    }

    @Override
    public int compareTo(Friend o) {
        return this.name.compareTo(o.getName());
    }
}
