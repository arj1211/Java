package data;

public class WaveManager {

	
	private float timeSinceLastWave, timeBetweenEnemies;
	private int waveNumber, enemiesPerWave;
	private Enemy enemyType;
	private Wave currentWave;
	
	public WaveManager(Enemy enemyType, float timeBetweenEnemies, int enemiesPerWave){
		this.enemyType=enemyType;
		this.timeSinceLastWave=0;
		this.timeBetweenEnemies=timeBetweenEnemies;
		this.waveNumber=0;
		this.enemiesPerWave=enemiesPerWave;
		
		this.currentWave=null;
		newWave();
	}
	
	
	public Wave getCurrentWave() {
		return currentWave;
	}


	public void update(){
		if (!currentWave.isCompleted())
			currentWave.update();
		else
			newWave();
	}
	
	private void newWave(){
		currentWave= new Wave(enemyType,timeBetweenEnemies,enemiesPerWave);
		waveNumber++;
		System.out.println("Beginning Wave "+waveNumber);
	}
	
}
