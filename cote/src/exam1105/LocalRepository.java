package exam1105;

public class LocalRepository  implements MemoRepository {

	@Override
	public void addMemo(String id, String body) {
		System.out.println("pc에 메모를 추가합니다.");
		
	}

	@Override
	public void getMomo() {
		System.out.println("pc에서 메모를 조작합니다.");
		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("pc의 메모를 삭제합니다.");
		
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("pc의 메모를 수정 합니다.");
		
	}

	
	
}
