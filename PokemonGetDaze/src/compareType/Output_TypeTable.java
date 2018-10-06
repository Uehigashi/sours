package compareType;

import java.util.HashMap;
import java.util.Map;

import main.Type;

public class Output_TypeTable implements OutputTypeTable {
	
	Map<Type, Double> typeTable = new HashMap<Type, Double>();

	@Override
	public Map<Type, Double> getMizuTypeTable() {
		// TODO 自動生成されたメソッド・スタブ
		typeTable.put(Type.HONO, 2.0);
		typeTable.put(Type.KUSA, 0.5);
		typeTable.put(Type.MIZU, 0.5);
		return typeTable;
	}

	@Override
	public Map<Type, Double> getKusaTypeTable() {
		// TODO 自動生成されたメソッド・スタブ
		typeTable.put(Type.HONO, 0.5);
		typeTable.put(Type.KUSA, 0.5);
		typeTable.put(Type.MIZU, 2.0);
		return typeTable;
	}

	@Override
	public Map<Type, Double> getHonoTypeTable() {
		// TODO 自動生成されたメソッド・スタブ
		typeTable.put(Type.HONO, 0.5);
		typeTable.put(Type.KUSA, 2.0);
		typeTable.put(Type.MIZU, 0.5);
		return typeTable;
	}

}
