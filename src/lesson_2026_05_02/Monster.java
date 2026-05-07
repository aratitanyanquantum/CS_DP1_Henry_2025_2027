public class Monster {
    public static final int ICE_MONSTER_TYPE = 1;
    public static final int WATER_MONSTER_TYPE = 2;
    public static final int FIRE_MONSTER_TYPE = 3;
    public String name = "Unknown";
    public int health = 100;
    public int strength = 10;
    public int monsterType = 0;

    public Monster(String name, int health, int monsterType) {
        this.name = name;
        this.health = health;
        this.monsterType = monsterType;
    }

    public void attack(Monster defender) {
        int damage = rollDice();
        defender.health -= damage;
        if (defender.health < 0) defender.health = 0;
        if (defender.health > 0)
            output(defender.name + " took " + damage + " damage. Health: " + defender.health);
        else
            output(defender.name + " must leave the game");
    }

    private static int rollDice() {
        //returns a random integer between 1 and 12
        return new java.util.Random().nextInt(12)+1;
    }

    public static void output(String message) {
        System.out.println(message);
    }
}

public class WaterMonster extends Monster {
    public WaterMonster(String name, int health) {
        super(name, health, Monster.WATER_MONSTER_TYPE);
    }
}

public class FireMonster extends Monster {
    public FireMonster(String name, int health) {
        super(name, health, Monster.FIRE_MONSTER_TYPE);
    }
}

FireMonster flamey = new FireMonster("Flamey", 40);

public class Arena {
    public Monster[] monsters = new Monster[10];
    int monsterCount = 0; //the number of monsters currently in array

    public void addMonster(Monster M) {
        if (monsterCount >= monsters.length) {
            output("Array is full");
            return;
        }
        for (int i = 0; i < monsterCount; i++) {
            if (monsters[i] == M) {
                output("Monster already in array");
                return;
            }
        }
        monsters[monsterCount] = M;
        monsterCount++;
    }

    public void removeMonster(Monster M) {
        for (int i = 0; i < monsterCount; i++) {
            if (monsters[i] == M) {
                for (int j = i; j < monsterCount - 1; j++)
                    monsters[j] = monsters[j + 1];
                monsters[monsterCount - 1] = null;
                monsterCount--;
                return;
            }
        }
    }

    public void doOneOnOneBattle(Monster A, Monster B) {
        while (A.health > 0 && B.health > 0) {
            //gameLog(A.attack(B));
            //gameLog(B.attack(A));
        }
        if (A.health > B.health) {
            output(A.name + " WINS!");
            removeMonster(B);
        } else if (B.health > A.health) {
            output(B.name + " WINS!");
            removeMonster(A);
        } else {
            output("IT IS A DRAW!");
        }
    }

    public static void output(String message) {
        System.out.println(message);
    }
}

public static void main(String[] args) {
}