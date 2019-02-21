
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<p><b><big>Danh Sách Khách Hàng</big></b></p>
<table border="1px" cellpadding="5px" cellspacing="0px">
  <tr>
    <th width="150px">Họ</th>
    <th width="200px">Tên</th>
    <th width="100px">Tuổi</th>
  </tr>
  <tr onclick="window.location='/customerdetail?id=1'">
    <td>Phạm</td>
    <td>Văn Thanh</td>
    <td>22</td>
  </tr>
  <tr onclick="window.location='/customerdetail?id=2'">
    <td>Trần</td>
    <td>Văn Đạt</td>
    <td>19</td>
  </tr>
  <tr onclick="window.location='/customerdetail?id=3'">
    <td>Dương</td>
    <td>Minh Hằng</td>
    <td>18</td>
  </tr>
</table>
</body>
</html>
