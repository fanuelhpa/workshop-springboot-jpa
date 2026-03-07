package com.fandev.myfin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fandev.myfin.entities.User;
import com.fandev.myfin.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		
		//Obtem a referencia do usuario do banco de dados
		User userOfBank = userRepository.getReferenceById(id);
		
		//Atualiza os dados do usuário
		updateData(userOfBank, user);
		
		//Salva o usuario com os novos dados
		User userUpdated = userRepository.save(userOfBank);
	
		//Retorna o usuario atualizado
		return userUpdated;
		
	}
	
	//Metodo que atualiza os dados do usuário
	private void updateData(User userOfBank, User user) {
		userOfBank.setName(user.getName());
		userOfBank.setEmail(user.getEmail());
		userOfBank.setPhone(user.getPhone());
	}
}
