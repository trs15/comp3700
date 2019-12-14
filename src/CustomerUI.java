
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerUI {
    public JFrame view;

    public JButton btnEditPurchases = new JButton("Edit Purchases");
    public JButton btnDelPurchases = new JButton("Delete Purchases");
    public JButton btnAddPurchase = new JButton("Add New Purchase");


    public CustomerUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System: Admin Panel");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System: Admin Panel");
        title.setAlignmentX(title.CENTER_ALIGNMENT);

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());

        panelButtons.add(btnAddPurchase);
        panelButtons.add(btnEditPurchases);
        panelButtons.add(btnDelPurchases);

        view.getContentPane().add(panelButtons);


        btnAddPurchase.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddPurchaseUI ap = new AddPurchaseUI();
                ap.run();
            }
        });

        btnEditPurchases.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               System.out.println("Clicked Edit Purchase");
            }
        });

        btnDelPurchases.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Clicked Delete Purchases");
            }
        });

    }
}
