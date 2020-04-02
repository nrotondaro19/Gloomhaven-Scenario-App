import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GloomhavenApp implements ActionListener {
    private JLabel label1;
    private JLabel label2;

    public GloomhavenApp() {
        //Creating GUI for app
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        
        button.setText("Select Goals");
        label1 = new JLabel("Scenario Goal #1");
        label2 = new JLabel("Scenario Goal #2");

        //Adding Listening Event
        button.addActionListener(this);

        //Setting GUI
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label1);
        panel.add(label2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gloomhaven Helper");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GloomhavenApp();
    }

    //Creating Randomizer for deck
    public String getRandomElement(List<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    //Creating deck
    public List<String> getScenarioList() {
        List<String> scenarioGoals = new ArrayList<>();
        scenarioGoals.add("Opener: Be the first to kill a monster during the scenario. (1)");
        scenarioGoals.add("Hunter: Kill one or more elitle monsters during the scenario. (1)");
        scenarioGoals.add("Scrambler: Take only short rests during the scenario. (1)");
        scenarioGoals.add("Straggler: Take only long rests during the scenario. (1)");
        scenarioGoals.add("Neutralizer: Cause a trap to be sprung or disarmed on your turn or on the turn of one of your summons during the scenario. (1)");
        scenarioGoals.add("Masochist: Your current hit point value must be equal to or less than 2 at the end of the scenario. (1)");
        scenarioGoals.add("Streamliner: Have five or more total cards in your hand and discard at the end of the scenario. (1)");
        scenarioGoals.add("Dynamo: Kill a monster during the scenario by causing at least 4 more points of damage to it than is necessary. (1)");
        scenarioGoals.add("Fast Healer: Your current hit point value must be equal to your maximum hit point value at the end of the scenario. (1)");
        scenarioGoals.add("Hoarder: Loot five or more money tokens during the scenario. (1)");
        scenarioGoals.add("Pacifist: Kill three or fewer monsters during the scenario. (1)");
        scenarioGoals.add("Diehard: Never allow your current hit point value to drop below half your maximum hit point value (rounded up) during the scenario. (1)");
        scenarioGoals.add("Protector: Allow none of your character allies to become exhausted during the scenario. (1)");
        scenarioGoals.add("Workhorse: Gain 13 or more experience points during the scenario. (1)");
        scenarioGoals.add("Executioner: Kill an undamaged monster with a single attack during the scenario. (1)");
        scenarioGoals.add("Explorer: Reveal a room title by opening a door on your turn during the scenario. (1)");
        scenarioGoals.add("Plunderer: Loot a treasure overlay title during the scenario. (1)");
        scenarioGoals.add("Sadist: Kill five or monsters during the scenario. (1)");
        scenarioGoals.add("Zealot: Have three or fewer total cards in your hand and discard at the end of the scenario. (1)");
        scenarioGoals.add("Professional: Use your equipped items a number of times equal to or greater than your level plus 2 during the scenario. (1)");
        scenarioGoals.add("Aggressor: Have one or more monsters present on the map at the beginning of every round during the scenario. (2)");
        scenarioGoals.add("Indigent: Loot no money tokens or treasure overlay titles during the scenario. (2)");
        scenarioGoals.add("Layabout: Gain 7 or fewer experience points during the scenario. (2)");
        scenarioGoals.add("Purist: Use no items during the scenario. (2)");

        return scenarioGoals;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        //Grabbing deck
        List<String> scenarioDeck = getScenarioList();

        //Setting First Option
        label1.setText(this.getRandomElement(scenarioDeck));

        //Removing First Option From List
        String labelText = label1.getText();
        scenarioDeck.remove(labelText);

        //Setting Second Option
        label2.setText(this.getRandomElement(scenarioDeck));
    }
}