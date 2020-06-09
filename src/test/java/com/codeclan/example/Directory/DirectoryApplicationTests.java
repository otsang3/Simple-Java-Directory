package com.codeclan.example.Directory;

import com.codeclan.example.Directory.models.File;
import com.codeclan.example.Directory.models.Folder;
import com.codeclan.example.Directory.models.User;
import com.codeclan.example.Directory.repositories.FileRepository;
import com.codeclan.example.Directory.repositories.FolderRepository;
import com.codeclan.example.Directory.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DirectoryApplicationTests {

	File file;
	Folder folder;
	User user;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;




	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateFileFolderUser(){
		user = new User ("Oscar");
		folder = new Folder ("Photos", user);
		file = new File ("RandomPicture", ".jpeg", 5.5, folder);

		userRepository.save(user);
		folderRepository.save(folder);
		fileRepository.save(file);
	}

}
