����   A u  main/FootballGame  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lmain/FootballGame; main ([Ljava/lang/String;)V  java/util/ArrayList
  	  
model/Team  	토트넘
     (Ljava/lang/String;)V  맨체스터 유나이티드  model/Forward  	손흥민
  !  " (Ljava/lang/String;IIII)V $ & % java/util/List ' ( add (Ljava/lang/Object;)Z * 해리 케인 , 쿨루셉스키 . model/Defender 0 	로메로
 - ! 3 	다이어 5 model/Goalkeeper 7 	요리스
 4 9  : (Ljava/lang/String;II)V < 래시포드 > 	브루노 @ 	안토니 B 바란 D 마르티네스 F 
데 헤아
  H I J 
getPlayers ()Ljava/util/List; $ L M N addAll (Ljava/util/Collection;)Z P java/util/Scanner	 R T S java/lang/System U V in Ljava/io/InputStream;
 O X  Y (Ljava/io/InputStream;)V [ service/PlayerComparison
 Z ]  ^ (Ljava/util/List;)V
 Z ` a b comparePlayersByPosition (Ljava/util/Scanner;)V
 O d e  close args [Ljava/lang/String; players Ljava/util/List; 	tottenham Lmodel/Team; manUtd scanner Ljava/util/Scanner; 
comparison Lservice/PlayerComparison; LocalVariableTypeTable  Ljava/util/List<Lmodel/Player;>; 
SourceFile FootballGame.java !               /     *� �    
       	             	      /    m� Y� L� Y� M� Y� N+� YZU_X�  � # W+� Y)XV^U�  � # W+� Y+UTZS�  � # W+� -Y/KZ\X� 1� # W+� -Y2IUWT� 1� # W+� 4Y6_^� 8� # W+� Y;YT]W�  � # W+� Y=WV[U�  � # W+� Y?TRYT�  � # W+� -YAJ\ZV� 1� # W+� -YCHXUS� 1� # W+� 4YE`_� 8� # W+,� G� K W+-� G� K W� OY� Q� W:� ZY+� \:� _� c�    
   Z           4  L  d  |  �  �  �  �  �    4 !? "J %V &` 'g (l )    >   m f g   e h i  [ j k  Q l k V  m n `  o p  q     e h r   s    t