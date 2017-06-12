/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athlete;

/**
 *
 * @author marusiaochoaramirez
 */
public class Driver {
    public static void main(String[] args) {
        QuarterBack q1 = new QuarterBack("david", "football", 12, 30.0);
        QuarterBack q2 = new QuarterBack("aaa", "football", 22, 10.0);
        QuarterBack q3 = new QuarterBack("bbb", "football", 32, 40.0);
        Golfer g1 = new Golfer("tiger", "golf", "Eagle", 10);
        Golfer g2 = new Golfer("bbb", "golf", "birdie", 70);
       int totalforfootball ;
       totalforfootball = q1.determinatePoints("aaa", 10);
       q1.updateScore(totalforfootball);
       totalforfootball = q1.determinatePoints("aaa", 20);
       q1.updateScore(totalforfootball);
       
       int totalforgolf;
       totalforgolf = g1.determinatePoints("birdie", 10);
       g1.updateScore(totalforgolf);
       totalforgolf = g1.determinatePoints("double bogey", 20);
       g1.updateScore(totalforgolf);
       
       
    }
    
    
    
}
