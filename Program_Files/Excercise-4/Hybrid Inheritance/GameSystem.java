class GameCharacter {
    String name;

    GameCharacter(String name) {
        this.name = name;
    }
void showCharacter() {
        System.out.println("Character: " + name);
    }
}
class Warrior extends GameCharacter {
    Warrior(String name) {
        super(name);
    }
void attack() {
        System.out.println(name + " performs a physical attack.");
    }
}
class Mage extends GameCharacter {
    Mage(String name) {
        super(name);
    }
void castSpell() {
        System.out.println(name + " casts a magical spell.");
    }
}
class Paladin extends Warrior {
    Mage magicSkills; 

    Paladin(String name, Mage magicSkills) {
        super(name);
        this.magicSkills = magicSkills;
    }

    void useMagic() {
        magicSkills.castSpell();
    }
}
public class GameSystem {
    public static void main(String[] args) {
        Mage mage = new Mage("Gandalf");
        Paladin paladin = new Paladin("Arthur", mage);
        paladin.showCharacter();
        paladin.attack(); 
        paladin.useMagic();
    }
}