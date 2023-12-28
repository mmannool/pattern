package weather;
//주제 인터페이스
public interface Subject {
	public void registerObserver(Observer o); //옵저버 등록
	public void removeObserver(Observer o);   //옵저버 삭제
	public void notifyObservers();           //주제 상태 변경 시 모든 옵저버에게 변경 내용 알림
}
