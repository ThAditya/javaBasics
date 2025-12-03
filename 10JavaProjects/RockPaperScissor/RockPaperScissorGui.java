import java.awt.Font;

import javax.swing.*;
public class RockPaperScissorGui extends JFrame {
    public RockPaperScissorGui() {
        // for display window title
        super("Rock Paper Scissor");
        // Set the size
        setSize(450, 574);
        
        setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    private void addGuiComponents(){
        JLabel computerScoreLabel = new JLabel("Computer: 0");
        computerScoreLabel.setBounds(10, 53, 450, 30);

        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerScoreLabel);

    }
}
