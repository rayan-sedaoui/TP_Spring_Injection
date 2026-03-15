package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
@Component("daoFile")
//@Profile("file")
public class DaoFile implements IDao {
    @Override
    public double getValue() { return 180.0; }
}