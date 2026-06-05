public boolean login(String username, String password) {

    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM users WHERE username= khalil AND password=khalil";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        return rs.next();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return false;
}
