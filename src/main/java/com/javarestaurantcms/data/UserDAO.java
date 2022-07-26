package com.javarestaurantcms.data;
import com.javarestaurantcms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserDAO extends JpaRepository<User, Long> {
}
