package com.javarestaurantcms.data;
import com.javarestaurantcms.models.Infos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface InfosDAO extends JpaRepository<Infos, Long> {
}
