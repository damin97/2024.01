// Inside the actionPerformed method

@Override
public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
        // ... (unchanged code)
        case "조회":
            String searchId = JOptionPane.showInputDialog("Enter ID to search:");
            for (Account acc : list) {
                if (acc.getId().equals(searchId)) {
                    lb7.setText("조회 결과: " + acc.toString());
                    return;
                }
            }
            lb7.setText("ID가 일치하는 계정이 없습니다.");
            break;
        case "수정":
            String modifyId = JOptionPane.showInputDialog("Enter ID to modify:");
            for (Account acc : list) {
                if (acc.getId().equals(modifyId)) {
                    // Assuming you have setters in your Account class
                    acc.setName(JOptionPane.showInputDialog("Enter new name:"));
                    acc.setPassword(JOptionPane.showInputDialog("Enter new password:"));
                    acc.setTel(JOptionPane.showInputDialog("Enter new phone number:"));
                    acc.setSsn(JOptionPane.showInputDialog("Enter new SSN:"));
                    try {
                        // Handle balance input with error handling
                        int newBalance = Integer.parseInt(JOptionPane.showInputDialog("Enter new balance:"));
                        acc.setBalance(newBalance);
                    } catch (NumberFormatException ex) {
                        lb7.setText("Invalid balance input");
                        return;
                    }
                    lb7.setText("계정 정보가 수정되었습니다.");
                    return;
                }
            }
            lb7.setText("ID가 일치하는 계정이 없습니다.");
            break;
        case "삭제":
            String deleteId = JOptionPane.showInputDialog("Enter ID to delete:");
            for (Account acc : list) {
                if (acc.getId().equals(deleteId)) {
                    list.remove(acc);
                    lb7.setText("계정이 삭제되었습니다.");
                    return;
                }
            }
            lb7.setText("ID가 일치하는 계정이 없습니다.");
            break;
        // ... (unchanged code)
    }
}
