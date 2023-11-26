package com.example.demo.flowers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
	int maximum = 10; // so the linter is okay
	// private FlowerService flowerService;

	// @Autowired
	// public FlowerController(FlowerService flowerService) {
	// 	this.flowerService = flowerService;
	// }
	@GetMapping("/flowers")
	public List<Flower> getFlowers() {
		List<Flower> flowers = new ArrayList<>();
		// flowers.add(new Flower(3, 5, 7, 1));
		// flowers.add(new Flower(4, 6, 8, 1));
		
		return flowers;
	}


    @GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping("/flower")
	public Flower getFlower() {
		int rndInt = (int) (Math.random() * maximum);
		return new Flower(rndInt, rndInt, rndInt, rndInt);
	}
    
}
