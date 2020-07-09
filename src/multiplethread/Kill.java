/**
 * @author dong
 * @date 2020/4/29 - 20:57
 */
package multiplethread;

import charactor.Hero;

public class KillThread extends Thread{

    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}