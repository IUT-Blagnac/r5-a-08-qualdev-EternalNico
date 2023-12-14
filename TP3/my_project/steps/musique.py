class Musique:
    def __init__(self, like_listening_music=False):
        self.like_listening_music = like_listening_music
        self.album_dropped = False
        self.love_kanye = False

    def listen_music(self):
        self.like_listening_music = True

    def drop_album(self):
        if self.like_listening_music:
            self.album_dropped = True

    def love_kanye_now(self):
        if self.album_dropped:
            self.love_kanye = True
