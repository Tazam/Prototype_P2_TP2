/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "m1.piu.Clear"
)
@ActionRegistration(
        displayName = "#CTL_Clear"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_Clear=Clear")
public final class Clear implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //
        NotifyDescriptor d =
            new NotifyDescriptor.Confirmation("Really do this?!", "Dialog Title",
                                       NotifyDescriptor.OK_CANCEL_OPTION);
            if (DialogDisplayer.getDefault().notify(d) == NotifyDescriptor.OK_OPTION) {
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Clearing...", NotifyDescriptor.WARNING_MESSAGE));
            }
    }
}
