package in.bushansirgur.springboot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.bushansirgur.springboot.entity.Product;
import in.bushansirgur.springboot.repo.ProductRepo;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class SpringbootjuintApplicationTests {

	@Autowired
	ProductRepo pRepo;
	
	/*
	 * @Test
	 * 
	 * @Order(1) public void testCreate () { Product p = new Product(); p.setId(1L);
	 * p.setName("iPhone XR"); p.setDesc("Fantastic"); p.setPrice(1000.00);
	 * pRepo.save(p); assertNotNull(pRepo.findById(1L).get()); }
	 */
	/*
	 * @Test
	 * 
	 * @Order(2) public void testReadAll () { List list = pRepo.findAll();
	 * assertThat(list).size().isGreaterThan(0); }
	 */
		
	/*
	 * @Test
	 * 
	 * @Order(3) public void testRead () { Product product =
	 * pRepo.findById(1L).get(); assertEquals("iPhone XR", product.getName()); }
	 */
	  @Test
	 
	  @Order(4) public void testUpdate () { Product p = pRepo.findById(1L).get();
	  p.setPrice(800.00); pRepo.save(p); assertNotEquals(700.00,
	  pRepo.findById(1L).get().getPrice()); }
	  
	  
	/*
	 * @Test
	 * 
	 * @Order(5) public void testDelete () { pRepo.deleteById(1L);
	 * assertThat(pRepo.existsById(1L)).isFalse(); }
	 */

}
