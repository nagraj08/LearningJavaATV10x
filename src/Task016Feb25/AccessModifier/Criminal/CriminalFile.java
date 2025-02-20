package Task016Feb25.AccessModifier.Criminal;

import Task016Feb25.AccessModifier.COP.Cop;

public class CriminalFile {
    public static void main(String[] args) {
        Cop criminal1 = new Cop(100);
        criminal1.cannotShoot();
    }
}
