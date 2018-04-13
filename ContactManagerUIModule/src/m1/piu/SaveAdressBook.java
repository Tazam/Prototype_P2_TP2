/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.progress.*;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;

@ActionID(
        category = "File",
        id = "m1.piu.SaveAdressBook"
)
@ActionRegistration(
        displayName = "#CTL_SaveAdressBook"
)
@ActionReference(path = "Menu/Adress Book", position = 3333, separatorBefore = 3283)
@Messages("CTL_SaveAdressBook=Save Adress Book")
public final class SaveAdressBook implements ActionListener {
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(new Runnable() {
      public void run() {
        ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Please wait....");
        myProgressHandle.start();
        //DO TASK HERE
        myProgressHandle.progress("Doing task...");
        myProgressHandle.finish();
          }
    }).start();
        RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);
    }
    */
     @Override
    public void actionPerformed(ActionEvent e) {
        Runnable myRunnable = new Runnable() {
        @Override
        public void run() {
        ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Please wait....");
        myProgressHandle.start();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Exceptions.printStackTrace(ex);
            }
        myProgressHandle.progress("Doing task...");
        myProgressHandle.finish();
        }
        };
        RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);
    }
}
