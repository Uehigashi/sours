package AttackSkill;

import main.Type;

public class AttackSkill {
	private String name;
	private Type skillType;
	private double attackSkillPower;
	
	public AttackSkill(String name, Type skillType, double attackPower) {
		this.name = name;
		this.skillType = skillType;
		this.attackSkillPower = attackPower;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Type getSkillType() {
		return skillType;
	}
	public void setSkillType(Type skillType) {
		this.skillType = skillType;
	}
	
	public double getAttackPower() {
		return attackSkillPower;
	}
	public void setAttackPower(double attackPower) {
		this.attackSkillPower = attackPower;
	}
}
