package compareType;

import java.util.Map;

import main.Type;

public class CompareAttackTypeKusa implements CompareType {

	@Override
	public Double compareType(Type enemyType) {
		// TODO 自動生成されたメソッド・スタブ
		Map<Type, Double> typeTable = new Output_TypeTable().getKusaTypeTable();
		return typeTable.get(enemyType);
	}

}
