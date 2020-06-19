package Builder;

// AbstractBuilder
public abstract class BluePrint { // 아키텍처 또는 공학 설계를 문서화한 기술 도면을 인화로 복사하거나 복사한 도면을 말한다. 
	
	/* 기본적으로 설계도의 모양은 이런 부분이 필요하다 정의해줌 - BuildPart */
	public abstract void setCpu();
    public abstract void setRam();
    public abstract void setStorage();
    
    public abstract Computer getComputer();
}
