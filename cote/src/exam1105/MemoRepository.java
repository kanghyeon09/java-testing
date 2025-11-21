package exam1105;

public interface MemoRepository {
	
	void addMemo(String id, String body);
	void getMomo();
	void deleteMemo(String id);
	void updateMemo(String id, String body);

}
