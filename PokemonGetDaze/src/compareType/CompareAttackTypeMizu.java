package compareType;

import java.util.Map;

import main.Type;

public class CompareAttackTypeMizu implements CompareType {

	@Override
	public Double compareType(Type enemySkillType) {
		// TODO 自動生成されたメソッド・スタブ
		Map<Type, Double> typeTable = new Output_TypeTable().getMizuTypeTable();
		return typeTable.get(enemySkillType);
	}
}
