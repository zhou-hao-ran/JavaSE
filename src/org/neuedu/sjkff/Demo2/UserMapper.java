package org.neuedu.sjkff.Demo2;

import java.util.Date;
import java.util.List;

public interface UserMapper {
    User userLogin(User user);

    int findSignInfoByIdAndDate(Long uid, String signIn);

    int insertSignInfo(Long uid, Date signIn);

    int updateSignInfo(Long uid,Date signOut);

    List<SignInfo> getSignInfoByUid(Long uid);
}
