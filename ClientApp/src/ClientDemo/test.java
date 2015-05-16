/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientDemo;

import com.sun.jna.*;

/**
 *
 * @author msi
 */
public class test {
    public static void main(String args[]) {
		FinalClient connection = new FinalClient();
		int isConnect = connection.selectOption(1, "dayishen", "dahaoshen", "2014-09-21");
		System.out.println(isConnect);
        for(int i=0 ;i<connection.temp_description.size(); i++)
            System.out.println(connection.temp_description.get(i));

	}
}

